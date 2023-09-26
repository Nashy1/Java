package OCPBook.Chapter5;

public class ZooTickets {
    public static void main(String[] args) {
        int tickets =2;                //tickets = 2
        String guests ="abc";          //guests =abc
        addTickets(tickets);           //tickets = 2 because we have not assigned the method to tickets
//        tickets = addTickets(tickets);
        guests =addGuest(guests);      //guests = abcd
        System.out.println(tickets + guests);  //2abcd
    }
    public static int addTickets(int tickets){
        tickets++;
        return tickets;
    }
    public static String addGuest(String guests){
        guests += "d";
        return guests;
    }

}
