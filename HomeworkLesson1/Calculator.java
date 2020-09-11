package HomeworkLesson1;

public class  Calculator {

        public static void toCalculate (int a, int b, String s) {
            if (s == "+") {
                System.out.println( a + b); }
            else if( s == "-") {
                System.out.println(a - b);
            }
            else if(s == "*") {
                System.out.println(a * b);
            }
            else if(s == "/") {
                System.out.println(a / b);
            }
            else if(s == "%") {
                System.out.println(a % b);
            }
            else if(s == "^") { //способ возведения числа в степень
                int result = 1;
                for (int i = 1; i <= b; i++) {
                    result = result * a;
                }
                System.out.println(result);
            }

        }


        public static void main(String[] args) {
            toCalculate(3,0 , "^");
        }
    }

