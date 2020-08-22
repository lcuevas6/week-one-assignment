
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
double coffeItemPrice = 2.95;
double donutItemPrice = 1.89;
double johnsMoneyInWallet = 100.45;
double carlosMoneyInWallet = 45.95;
float johnsNumberOfFriends = 7;
int carlosNumberOfFriends = 11;
float johnsAge = 31;
int carlosAge = 25;
String firstName = "John";
String firstNameTwo = "Carlos";
String lastName = "Smith";
String lastNameTwo = "Garcia";
char middleInitial = 'L';
char middleInitialTwo = 'M';
System.out.println(coffeItemPrice);
System.out.println(donutItemPrice);
System.out.println(johnsMoneyInWallet);
System.out.println(carlosMoneyInWallet);
System.out.println(johnsAge);
System.out.println(carlosAge);
System.out.println(firstName);
System.out.println(firstNameTwo);
System.out.println(lastName);
System.out.println(lastNameTwo);
System.out.println(middleInitial);
System.out.println(middleInitialTwo);

double johnsNewAmountOfMoney = johnsMoneyInWallet - donutItemPrice;
System.out.println(johnsNewAmountOfMoney);

float johnsNumberOfFriendsPerYear = johnsAge / johnsNumberOfFriends; 
// Had to change johnsAge & johnsNumberOfFriends to floats because it would round down to a whole number.
System.out.println(johnsNumberOfFriendsPerYear);

String fullName  = firstName + " " + middleInitial + " " + lastName;
System.out.println(fullName);

System.out.println("John's left over money after buying a donut is $" + johnsNewAmountOfMoney);
System.out.println("John has had " + johnsNumberOfFriendsPerYear + " friends per year");
System.out.println("His full name is " + fullName);







































		














	}

}
