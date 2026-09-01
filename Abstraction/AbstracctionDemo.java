// package Abstraction;
// /**
//  * Payment p = new UPIpayment
//  * payment p = new Creditpayment()
//  * 
//  */

// import java.util.Scanner;

// public class AbstractionDemo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int choice = 1;
//         double amount = 100000;

//         Payment payment = Factory.getPayment(choice);
//         LoanService ls = new LoanService();
//         ls.clearLoan(payment, amount);

//     }

// }

// interface Payment {

//     boolean pay(double amount);
// }

// class LoanService {
//     public void clearLoan(Payment payment, double amount) {

//         if (payment.pay(amount)) {
//             System.out.println("Loan Cleared Successfully ,Certification is generated");
//         } else {
//             System.out.println("Payment failed Loan is not cleared");
//         }

//     }

// }

// // Factory class or Factory Method
// class Factory {

//     static  Payment getPayment(int choice) {
//         switch (choice) {
//             case 1 -> {
//                 return new UPIPaytment();
//             }
//             case 2 -> {
//                 return new CreditCard();
//             }
//             case 3 -> {
//                 return new CryptoPayment();
//             }

//         }
//     }
// }

// class UPIPaytment implements Payment {
//     public boolean pay(double amount) {
//         System.out.println("Payment of " + amount + " is done by upi ");
//         return true;
//     }
// }

// class CreditCard implements Payment {
//     public boolean pay(double amount) {
//         System.out.println("Payment of" + amount + " is done my credit card");
//         return true;
//     }
// }

// class CryptoPayment implements Payment {
//     public boolean pay(double amount) {
//         System.out.println("Payment of" + amount + " is done using Crypto currency");
//         return true;
//     }
// }


/**
 * AbstractionDemo
 */
public class AbstracctionDemo {
    public static void main(String[] args) {
        int choice = 2;
        double amount = 10000;
        Payment payment = PaymentFactory.getPaymentobject(choice);
        LoanService ls = new LoanService();
        ls.clearLoan(payment, amount);

    }

}

class LoanService {
    public void clearLoan(Payment payment, double amount) {
        if (payment.pay(amount)) {
            System.out.println("Loan cleared");
        } else {
            System.out.println("Payment Failed");
        }
    }
}

class PaymentFactory{
    static Payment getPaymentobject(int choice){
        switch(choice){
            case 1 ->{
                return new UPIpayment();
            }
            case 2 ->{
                return new CreditCard() ;
            }
            case 3 ->{
                return new CryptoPayment();
            }
            default ->{
                return null;
            }
        }
    }
}

interface Payment {
    boolean pay(double amount);
}

class UPIpayment implements Payment {
    public boolean pay(double amount) {
        System.out.println("Payment of " + amount + " is done using UPI");
        return false;
    }
}

class CreditCard implements Payment {
    public boolean pay(double amount) {
        System.out.println("Payment of " + amount + " is done using credit car ");
        return true;
    }
}

class CryptoPayment implements Payment {
    public boolean pay(double amount) {
        System.out.println("Payment of " + amount + " is done using Crypto ");
        return true;
    }
}