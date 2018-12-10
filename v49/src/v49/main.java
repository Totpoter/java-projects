package v49;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    static int[] numbers = {1,1,1,2,6,7,8,4,3,7,8,9,3,1,3,7,8,5,3,4,8,9,6,4,2,4,7,9,7,4,3,2,3,6,7,8,7,7,5,7,9,6,1,4,0,8,6,5,6,8,9,0,7,5,4,3,2,4,5,9,8,5,9,8,8,4,5,6,7,8,9,0,9,0,9,7,5,2,1,2,3,4,5,4,4,5,3,4,5,0,8,7,0,7,9,7,0,6,5,4};
    static String[] names = {"Crystal","Tam","Ed","Beulah","Daina","Benjamin","Kia","Clelia","Cassy","Gita","Celsa","Karoline","Talitha","Lewis","Betsy","Colin","Glendora","Carola","Rosalba","Jeanie","Yevette","Armand","Neal","Lilla","Dorethea","Delta","Maye","Nikita","Shoshana","Carola","Margie","Haywood","Venessa","Natacha","Gilbert","Kandi","Tyisha","Tammie","Blossom","Penney","Diana","Audrey","Willard","Zoraida","Drusilla","Jacquline","Cyndy","Janiece","Tressie","Kami","Lashanda","Leann","Tom","Santana","Junita","Gisela","Tom","Marquerite","Bryant","Lauralee","Yael","Kelle","Samantha","Tom","Meta","Lanette","Wanetta","Carola","Jana","Neal","Brady","Rigoberto","Felicia","Hellen","Georgeann","Carola","Isaias","Ellis","Roseanne","Lenard","Ela","Ophelia","Alesha","Mafalda","Flor","Kelsi","Autumn","Sondra","Pasty","Jacquelyne","Benjamin","Emmie","Mickie","Lang","Jamee","Felice","Daniella","Carola","Nathalie","Genevive"};

    public static void main(String[] args){
        System.out.println(one());
        System.out.println(two());
        System.out.println(Arrays.toString(three()));
        System.out.println(four());
        System.out.println(five());
        System.out.println(six());
        System.out.println(seven());
        System.out.println(Arrays.toString(eight()));
        System.out.println(nine());
        System.out.println(ten());
    }

    public static int one(){
        int count = 0;

        // Gå igenom alla nummer
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == 7){
                // Kolla om längden på namnet är 7, lägg då till 1 på amount
                count++;
            }
        }

        // Ge tillbaka antalet
        return count;
    }

    public static int two(){
        int count = 0;

        // Gå igenom alla namn
        for(int i=0; i<names.length; i++){
            if(names[i] == "Tom"){
                count++;
                // Kolla om namnet är "Tom", ifall namnet är "Tom", lägg till 1
            }
        }

        // Ge tillbaka hur många det blev
        return count;
    }

    public static int[] three(){
    	// Skapa en lista med 10 platser
        int[] list = new int[10];

        // Skapa variabler för största och minsta nummret
        int max = 0;
        int maxNum = 0;
        int min = 0;
        int minNum = 0;

        // Gå igenom alla nummer
        for(int i=0; i<numbers.length; i++){
            list[numbers[i]] += 1;
            // Lägg in nummret i list om index är samma som nummret
        }
        
        // Gå igenom nya listan
        for(int i=0; i<list.length; i++){

            if(i==0){
                // Ifall 0 är minsta nummret, sätt då min till 0 och gå vidare
                min = list[i];
                continue;
            }

            // Kolla om detta numret är större än största nummret, sätt då detta nummer till max
            if(list[i] > max){
                max = list[i];
                maxNum = i;
            }

            // Kolla om detta numret är mindre än minsta nummret, sätt då detta nummer till min
            if(list[i] <= min){
                min = list[i - 1];
                minNum = i;
            }
        }

        int[] maxMin = {maxNum, minNum};

        // Ge tillbaka en lista med högsta och minsta nummret
        return maxMin;
    }

    public static int four(){
        int index = 0;

        // Gå igenom alla namn
        for(int i=0; i<names.length; i++){
            // Kolla om namnet är "Drusilla", sätt då index till nuvarande index.
            if(names[i] == "Drusilla"){
                index = i;
            }
        }

        // Ge tillbaka index
        return index;
    }

    public static int five(){
    	// Variabel för summan
        int sum = 0;

        // Gå igenom alla nummer
        for(int i=0; i<numbers.length; i++){
            // Kolla om nummret är jämnt
            if(numbers[i]%2 == 0){
                // Ifall numret är jämnt, addera summan
                sum += numbers[i];
            }
        }

        return sum;
    }

    public static int six(){
    	// Variabel för summan
        int sum = 0;

        // Gå igenom alla nummer
        for(int i=0; i<names.length; i++){
            // Kolla om namnet startar med L
            if(names[i].charAt(0) == 'L'){
            	// Lägg till 1 på antal
                sum++;
            }
        }

        // Ge tillbaka summan
        return sum;
    }

    public static int seven(){
    	// Variabel för summan
        int sum = 0;
        // För varje int i namnet, öka en variabel med 1
        for(int i=0;i<names.length;i++){
        	// Ifall i är 5, lägg till 1 i summan
            if(names[i].length() == 5){
                sum++;
            }
        }
        // Skicka tillbaka summan
        return sum;
    }

    public static int[] eight(){
        int[] list = new int[10];

        // Gå igenom alla nummer
        for(int i=0;i<numbers.length;i++){
            // Lägg till 1 i listan
            list[numbers[i]]++;
        }

        // Ge tillbaka listan med alla nummer
        return list;
    }

    public static int nine(){
    	// Variabel för resultatet
        int result = 0;

        // Kolla igenom alla namn
        for (int i = 0; i < names.length; i++) {
            //  Skapa en int som kan användas i en loop samt efter loopen
            int j;

            // Gå igenom namnen igen
            for (j = 0; j < names.length; j++) {
                // Kollar om namnet i första loopen är samma som i andra loopen.
                if(names[i] == (names[j])) {
                	// Om i är lika med j gå in i loopen och avbryt programmet
                    break;
                }
            }

            if(i == j) {
                result++;
            }
        }

        // Ge tillbaka resultatet
        return result;
    }

    public static String ten(){
        // Index och och antal på det vanligaste namnet
        int bigIndex = 0;
        int bigLength = 0;

        // Gå igenom alla namn
        for (int i = 0; i < names.length; i++) {
            // Sätt antal på namnet
            int num = 0;

            // Gå igenom namnen igen
            for (int j = 0; j < names.length; j++) {
                if(names[i].equals(names[j])) {
                    num++;
                    // Kolla om namnen i båda looparna är samma, lägg isåfall till 1 på antalet (num)
                }
            }

            if(num > bigLength) {
                // Om antalet är större än namnet, sätt bigLength och bigIndex till namnet.
                bigLength = num;
                bigIndex = i;
            }
        }

        // returnera det vanligaste namnet
        return names[bigIndex];
    }
}