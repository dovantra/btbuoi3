

public class bt1 {
    public static void main(String[] args) {
        String c = "You only live once, but if you do it right, once is enough";
        char kt = 'o';
        int count = 0;

        
        
        for (int i = 0;i < c.length(); i++) {
            if (c.charAt(i) == kt) {  
                System.out.println("xuathientaivitri:" + i);
                count++;
              
            }

        }
        System.out.println("so lan suat hien:"+count);}


    }
