
import static java.lang.System.out;
public class Temperatures
{
    public static void main(String[] args)
    {
        int temps[][] = new int[4][7]; 
        temps[0][0] = 68;
        temps[0][1] = 70;
        temps[0][2] = 76;
        temps[0][3] = 70;
        temps[0][4] = 68;
        temps[0][5] = 71;
        temps[0][6] = 75;
        temps[1][0] = 76;
        temps[1][1] = 76;
        temps[1][2] = 87;
        temps[1][3] = 84;
        temps[1][4] = 82;
        temps[1][5] = 75;
        temps[1][6] = 83;
        temps[2][0] = 73;
        temps[2][1] = 72;
        temps[2][2] = 81;
        temps[2][3] = 78;
        temps[2][4] = 76;
        temps[2][5] = 73;
        temps[2][6] = 77;
        temps[3][0] = 64;
        temps[3][1] = 65;
        temps[3][2] = 69;
        temps[3][3] = 68;
        temps[3][4] = 70;
        temps[3][5] = 74;
        temps[3][6] = 72;
        int rows = 4;
        int columns = 7;
        int i,j;
        String time[]= {"7 AM: ", "3 AM: ", "7 PM: ", "3 AM: "};
        String days[] ={"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        System.out.println("Temperature Calculator");
        System.out.println("");
        out.println("The data provided are:");
        
        
        
            
        for (i=0; i<time.length; i++)
        {
            System.out.print(time[i]);
            for(j=0; j<days.length; j++)
            {
              
                System.out.print( temps[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("Based on the data, the following are the average temperatures for the week.");
        
            int sumSun=0;
            int sumMon=0;
            int sumTue=0;
            int sumWed=0;
            int sumThur=0;
            int sumFri=0;
            int sumSat=0;
            
            
            for(i=0; i<4; i++)
            {
                for(j=0; j<1; j++)
                {
                    sumSun +=temps[i][j];
                }
                for(j=1; j<2; j++)
                {
                    sumMon +=temps[i][j];
                }
                for(j=2; j<3; j++)
                {
                    sumTue +=temps[i][j];
                }
                for(j=3; j<4; j++)
                {
                    sumWed +=temps[i][j];
                }
                for(j=4; j<5; j++)
                {
                    sumThur +=temps[i][j];
                }
                for(j=5; j<6; j++)
                {
                    sumFri +=temps[i][j];
                }
                for(j=6; j<7; j++)
                {
                    sumSat +=temps[i][j];
                }
            }
            int avgSun = sumSun/4; 
            System.out.println("Sun: " + avgSun);  
            int avgMon = sumMon/4; 
            System.out.println("Mon: " + avgMon);  
            int avgTues = sumTue/4; 
            System.out.println("Tue: " + avgTues); 
            int avgWed = sumWed/4; 
            System.out.println("Wed: " + avgWed);  
            int avgThu = sumThur/4; 
            System.out.println("Thu: " + avgThu);
            int avgFri = sumFri/4; 
            System.out.println("Fri: " + avgFri); 
            int avgSat = sumSat/4; 
            System.out.println("Sat: " + avgSat);
            int sumSevAm =0; 
            int sumSevPm = 0; 
            int sumThrAm = 0; 
            int sumThrPm = 0; 
        for(i =0; i<1; i++)
        {
            for (j=0; j<7; j++)
            {
                sumSevAm+= temps[i][j];  
            }
        }
        for(i =1; i<2; i++)
        {
            for (j=0; j<7; j++)
            {
                sumThrPm+= temps[i][j];  
            }
        }
        for(i =2; i<3; i++)
        {
            for (j=0; j<7; j++)
            {
                sumSevPm+= temps[i][j];  
            }
        }
        for(i =3; i<4; i++)
        {
            for (j=0; j<7; j++)
            {
                sumThrAm+= temps[i][j];  
            }
        }
        
        int avgSevAm = sumSevAm/7; 
        int avgSevPm = sumSevPm/7; 
        int avgThrAm = sumThrAm/7; 
        int avgThrPm = sumThrPm/7; 
        
        out.println("\n\n7:00 AM : " + avgSevAm); 
        out.println("3:00 PM : " + avgThrPm); 
        out.println("7:00 PM : " + avgSevPm); 
        out.println("3:00 AM : " + avgThrAm); 
        
        int sumTotal= 0; 
        for (i =0; i<4; i++)
        {
            for (j = 0; j<7; j++)
            {
               sumTotal+=temps[i][j]; 
            }
        }
        
        int avgTotal = sumTotal/28; 
        
        
        out.println(".... And the overall average: " + avgTotal); 
    }
            

}
        
            
    

        
        