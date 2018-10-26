
package com.company;




import java.util.*;


import java.lang.String;


public class Main {

    



    public static void main(String[] args) {


        String[] name = new String [50];


        name[0]="Dan";


        name[1]= "Val";


        name[2]= "Eden";


        name[3]="Alex";


        name[4]= "Bennett";


        name[5]="Prem";


        name[6]="Bryce";


        name[7]="Sydney";


        name[8]="Bobby";


        name[9]="Emma";


        name[10]="Tanner";


        name[11]="Phillipe";


        name[12]="Winston";


        name[13]="Todd";


        name[14]="Sean";


        name[15]="Jacob";


        name[16]="Bryan";


        name[17]="Grace";


        name[18]="Angelo";


        name[19]="Hannah";


        name[20]="Chloe";


        name[21]="Eva";


        name[22]="Kamryn";


        name[23]="Luke";


        name[24]="Amy";


        name[25]="Emilie";


        name[26]="Andrew";


        name[27]="Sydney";


        name[28]="Nick";


        name[29]="Aj";


        name[30]="Ava";


        name[31]="Alayna";


        name[32]="Shelby";


        name[33]="Jamie";


        name[34]="Chris";


        name[35]="Michael";


        name[36]="Anthony";


        name[37]="George";


        name[38]="Lily";


        name[39]="Angela";


        name[40]="Rylee";


        name[41]="Chase";


        name[42]="Selena";


        name[43]="Jake";


        name[44]="Summer";


        name[45]="Marlia";


        name[46]="Hailey";


        name[47]="Grace";


        name[48]="Don";


        name[49]="Jenna";


        String nombre = ("blank");


        for (int i = 0; i < name.length; i++){


            System.out.println(name[i]);


        }


        System.out.println("Pick a name above and keep it in your head. I will try to guess the name you are thinking of. Respond to each guess with: closer to a, closer to z, or correct");


        Arrays.sort(name);












        while(!nombre.equalsIgnoreCase("correct")){


            System.out.println("\n" + "Is your name " + name[name.length/2]);


            Scanner kbInput1 = new Scanner(System.in);


            nombre= kbInput1.nextLine();







            if (!nombre.equalsIgnoreCase("closer to a")){


                String min = name[0];


                String max = name[name.length / 2];


                String mid = name[((name.length / 2) / 2) - 1];


                Scanner kbInput2 = new Scanner(System.in);


                System.out.println("Is your name " + mid);


                String first = kbInput2.next();


            }


            else if (nombre.equalsIgnoreCase("closer to z")){


                String min2 = name[((name.length/2)+1)];


                String max2 = name[((name.length/2)+24)];


                String mid2 = name[((name.length/2)+37)];


                Scanner kbInput3 = new Scanner(System.in);


                System.out.println("Is your name ");


            }


            else if (nombre.equalsIgnoreCase("correct")) {


                //do nothing


            }


            else {


                System.out.println("Say: 'closer to a' or 'closer to z");


            }


        }

















    }


}

