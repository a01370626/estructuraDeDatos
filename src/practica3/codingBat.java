/*
 * Yael Mendoza Bonilla 
 * A01370626
 */
package practica3;

/**
 *
 * @author yamb_
 */
public class codingBat {
    

          public int factorial(int n) {
            if(n == 0){
                return 1;
            }else{
                return n * factorial(n-1);
            }
          }
          
            public int bunnyEars(int bunnies) {
             if(bunnies == 0){
               return 0;
             }else{
               return 2 * (bunnies);
             }
           }

        public int fibonacci(int n) {
          if(n <= 1){
            return n;
          }else{
            return fibonacci(n-1) + fibonacci(n-2);
          }
        }

        public int bunnyEars2(int bunnies) {
          if(bunnies == 0){
            return 0;
          }else{
            if(bunnies %2 != 0){
              return bunnyEars2(bunnies - 1) + 2;
            }else{
              return bunnyEars2(bunnies - 1) + 3;
           }
          }
        }        
    
     public int triangle(int rows) {
          if(rows == 0){
            return 0;
          }else{
            return triangle(rows - 1) + rows;
          }
        }       
        
        public int sumDigits(int n) {
          if(n == 0){
            return 0;
          }else{
            return sumDigits(n/10) + n%10;
          }
        }
        
        public int count7(int n) {
          if(n == 0){
            return 0;
          }else if(n%10 == 7){
              return count7(n/10) + 1;
            }
            else{
              return count7(n/10);
            }
        }        
        
        public int count8(int n) {
          if(n == 0){
            return 0;
          }else if(n%10 == 8){
            if(n / 10 % 10 == 8){
              return count8(n/10) + 2;
            }else{
              return count8(n/10) + 1;
            }
          }
            else{
              return count8(n/10);
            }

        }


        public int powerN(int base, int n) {

          if(n == 1){
            return base;
          }else{
            return base * powerN(base, n -1);
          }
        }
        
        public int countX(String str) {
          if(str.length() == 0){
            return 0;
          }else if(str.charAt(0) == 'x'){
            return 1 + countX(str.substring(1));
          }else{
            return countX(str.substring(1));
          }
        }

        public String changeXY(String str) {
          if(str.length() == 0){
            return str;
          }else if(str.charAt(0) == 'x'){
            return 'y' + changeXY(str.substring(1));
          }else{
            return str.charAt(0) + changeXY(str.substring(1));
          }
        }
        
        public boolean array6(int[] nums, int index) {
          if(index == nums.length){
            return false;
          }else if(nums[index] == 6){
            return true;
          }else{
            return array6(nums, index +1);
          }
        }

        public int array11(int[] nums, int index) {
          if(index == nums.length){
            return 0;
          }else if (nums[index] == 11){
            return array11(nums, index + 1) + 1;
          }else{
            return array11(nums, index + 1);
          }
        }
    
}
