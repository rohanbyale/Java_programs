package Short.Exception;

/**
 * Finally
 * A return in finally can hide an exception
 * The return inside finally overrides the earlier return value.
 */


// class Finally{
//   public static void main (String[] args) {
//     /* code */
//     System.out.println(Test.test());
//   }
// }

// class Test{
//   public static int test(){
//     try{
//       return 10;
//     }
//     finally{
//       return 20;
//     }
//   }
// }

//-------------------------------------------------

class Main {
    static int test() {
        try {
            int a = 10 / 0;
            
        } finally {
          return 100;
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}