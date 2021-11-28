public class TimeNeededToBuyTickets {

    public int timeRequiredToBuy(int[] tickets, int k) {
        int counter = 0;

        while (tickets[k] > 0){
            for(int i = 0; i < tickets.length; i++){
                if(tickets[i] != 0 && tickets[k] != 0){
                    tickets[i] -= 1;
                    counter++;
                }else continue;

            }
        }
        return counter;
    }

}
