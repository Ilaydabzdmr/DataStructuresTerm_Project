
public class TerminalRotator {
    public class Node{
        String cityName;
        Node next;

        int pendingLoad; //BONUS: Beklenen yük
        int priorityWeight; //BONUS: Öncelik ağırlığı(yükseklikle orantılı)

        public Node(String cityName){
            this.cityName = cityName;
            this.pendingLoad = 0;
            this.priorityWeight = 1;
        }
    }

    public Node head;
    public Node current;
    public boolean  prioritizeHeavyLoad = false; //BONUS: öncelikli terminal seçimi açık mı

    public  void initializeFromCityList(String[] cities){
        if(cities.length == 0) return;

        head = new Node(cities[0]);
        Node tail = head;

        for(int i = 1; i < cities.length; i++){
            tail.next = new Node(cities[i]);
            tail = tail.next;
        }

        tail.next = head;
        current = head;
    }

    //Aktif terminali bir ileri alır, log yazar
    public void advanceTerminal(){
        if(prioritizeHeavyLoad){
            current = getHeaviestLoadTerminal();
            System.out.println("\uD83D\uDCE6Priority rotated to (heaviest):" + current.cityName);
        }else{
            current = current.next;
            System.out.println("\uD83D\uDD01Terminal rotated to:" + current.cityName);
        }
    }

    public String getActiveTerminal(){
        return current.cityName;
    }

    public void printTerminalOrder(int rounds){
        Node temp = current;

        for(int i = 0; i < rounds; i++){
            System.out.println(temp.cityName + "->");
            temp = temp.next;
        }
        System.out.println("...");
    }

    //BONUS: Belirli bir terminalin yükünü arttırır
    public void incrementLoad(String cityName, int amount){
        Node node = head;
        do{
            if(node.cityName.equals(cityName)){
                node.pendingLoad += amount;
                break;
            }
            node = node.next;
        }while(node != head);
    }

    //BONUS: Ağırlığına göre en çok yüke sahip terminali döndürür
    public Node getHeaviestLoadTerminal(){
        Node maxNode = head;
        Node node = head.next;

        do{
            if(node.pendingLoad > maxNode.pendingLoad){
                maxNode = node;
            }
            node = node.next;
        }while(node != head);
        return maxNode;
    }

    //BONUS: Öncelikli yük rotasyon modunu aç/kapat
    public void setPrioritizeHeavyLoad(boolean value){
        this.prioritizeHeavyLoad = value;
    }

    //BONUS: Yük durumlarını yazdır
    public void printLoadStatus(){
        Node node = head;
        do{
            System.out.println("📍 " + node.cityName + "pending load:" + node.pendingLoad);
            node = node.next;
        }while(node != head);
    }
}
