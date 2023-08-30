package gr.aueb.cf.ch19.challenge;

public class IntToBinary {
    public static void main(String[] args) {
        int num = 353;
        int count = 0;

        String s = Integer.toBinaryString(num);
        char[] str = s.toCharArray();

             for(int i =0; i < str.length; i++){
                 count++;
             }

//
//                 count++;


        }
//        System.out.println("Numbers of 0's in num is: " + count);
//        System.out.println(str);
//    }

//    static void decimalToBinary(int num){
//        char[] s = Integer.toBinaryString(num).toCharArray();
//
//        System.out.println(Integer.toBinaryString(num));
//        System.out.println(s);
    }



