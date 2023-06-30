package practiceApril2023.arraysPractice;

import java.util.Random;

public class ArraysPractice1 {
    /*
    int[] lottoTicket1 = new int[6];
    lottoTicket1[0]=22;
    lottoTicket1[1]=16;
    lottoTicket1[2]=7;
    lottoTicket1[3]=09;
    lottoTicket1[4]=32;

    int[] lottoTicket = {24, 18, 9, 11, 34, 64};
        */

    /*Create a lottery quick
    pick application that will generate a loterry ticket with 6 random umber between 1-69.
     */
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;




    public static int[] generateNumber() {
        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
        }
        return ticket;
    }

    public static void printTicket(int ticket[]) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }

}


