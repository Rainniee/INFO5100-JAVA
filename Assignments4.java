/* Good Work
 * Score 10+ extra credit 2; Total score 10
 */
/* Question 1
 * Now you are given a string S, which represents a software license key which we would like to format. 
 * The string S is composed of alphanumerical characters and dashes. 
 * The dashes split the alphanumerical characters within the string into groups. (i.e. if there are M dashes, the string is split into M+1 groups). 
 * The dashes in the given string are possibly misplaced.
 * We want each group of characters to be of length K (except for possibly the first group, which could be shorter, but still must contain at least one character). 
 * To satisfy this requirement, we will reinsert dashes. Additionally, all the lower case letters in the string must be converted to upper case.
 * So, you are given a non-empty string S, representing a license key to format, and an integer K. And you need to return the license key formatted according to the description above.
 */

/** My thought:
 * 1.Because of the dashes, we cannot find out the correct length of the initial String S.So I firstly remove the dashes and converted letters to upper case.
 * 2.After getting the newLength,I create an array and make it format.
 */

package Assignments4;
import java.util.Scanner;

/**
 *
 * @author apple
 */
public class Assignments4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a string S: ");
        String s = in.next();
        System.out.println("Please enter a positive number K: ");
	int k = in.nextInt();
        licenseKeyFormatting(s,k);
// TODO code application logic here
    }
    
    public static String licenseKeyFormatting(String S, int K) { // score 2
        int len = 0;
        int n = 'a' - 'A';
        char[] tempArray = S.toCharArray(); //converts String S to a new character String.
        for (int i = 0; i < tempArray.length; i++) {
            char ch = tempArray[i];
            if (ch == '-') {
                continue;
            }
            else if (ch >= 'a' && ch <= 'z') {
                tempArray[i] -= n;
            }
            tempArray[len] = tempArray[i];
            len++;
        }
        int newLength;
        if (len % K == 0){
            newLength = len + len / K - 1;
        }
        else {
            newLength = len + len / K;
        }
        char[] newArray = new char[newLength];
        int m = len;
        for (int i = newLength - 1; i >= 0; i--) {
            if (i != newLength - 1 && (newLength-i) % (K+1) == 0) {
                newArray[i] = '-';
            } 
            else {
                m--;
                newArray[i] = tempArray[m];
            }
        }
        System.out.println(newArray);
        return String.valueOf(newArray);
      
    }
}


/* Question 2
 * Implement a class called Tool. It should have an int field called strength and a char field called type.You may make them either private or protected. 
 * The Tool class should also contain the function void setStrength(int), which sets the strength for the Tool.
 * Create 3 more classes called Rock, Paper, and Scissors, which inherit fromc Tool. 
 * Each of these classes will need a constructor which will take in an int that is used to initialise the strength field. 
 * The constructor should also initialise the type field using 'r' for Rock, 'p' for Paper, and 's' for Scissors.
 * These classes will also need a public function bool fight(Tool) that compares their strengths in the following way:
 * Rock's strength is doubled (temporarily) when fighting scissors, but halved (temporarily) when fighting paper. 
 * In the same way, paper has the advantage against rock, and scissors against paper. 
 * The strength field shouldn't change in the function, which returns true if the original class wins in strength and false otherwise. 
 * You may also include any extra auxiliary functions and/or fields in any of these classes. 
 * Run the program without changing the main function, and verify that the results are correct. (Score 2)
 */

/**
 *
 * @author apple
 */
class RockPaperSciddorGame{ // score 2
    public static void main(String args[]){
	Scissors s = new Scissor(5);
	Paper p = new Paper(7);
	Rock r = new Rock(15);
	    
	System.out.println(s.fight(p) + " , " + p.fight(s));
        System.out.println(p.fight(r) + " , " + r.fight(p));
        System.out.println(r.fight(s) + " , " + s.fight(r));
    }
    class Tool{
        protected int strength;
        protected char type;
        
        public Tool(){
        
        }
   
        public Tool(int n){
            this.strength = n;
        }
        public Tool(int n, char c){
            this.strength = n;
            this.type = c;
       }
        
        public void setStrength(int n){
            this.strength = n;
        }
        public int getStrength(){
            return this.strength;
        }
        public void setType(char c){
            this.type = c;
        }
        public char getType(){
            return this.type;
        }
    }
}

    class Scissors extends Tool {
        public Scissors(){
            this.type = 's';
        }
        public Scissors(int n){
            this.strength = n;
            this.type = 's';
        }
        public boolean fight(Tool tool){
            if(tool.type == 'r'){
                return this.strength > tool.strength * 2;
            }
            else if(tool.type == 'p'){
                return this.strength * 2 > tool.strength;
            }
            else
                return this.strength > tool.strength;
        }
    }
}

class Paper extends Tool {
        public Paper(){
            this.type = 'p';
        }
        public Paper(int n){
            this.strength = n;
            this.type = 'p';
        }
        public boolean fight (Tool tool){
            if(tool.type == 'r'){
                return this.strength * 2 > tool.strength;

	    }
            else if(tool.type == 's'){
                return this.strength > tool.strength * 2;
            }
            else
                return this.strength > tool.strength;
        }
    }
}

class Rock extends Tool{
        public Rock(){
            this.type = 'r';
        }
        public Rock(int n){
            this.strength = n;
            this.type = 'r';
        }
        public boolean fight (Tool tool){
            if(tool.type == 'p'){
                return this.strength > tool.strength * 2;
            }
            else if(tool.type == 's'){
                return this.strength * 2 > tool.strength;
            }
            else
                return this.strength > tool.strength;
        }
    }
}


/* Question 3
 * Every computer on the Internet has a unique identifying number, called an Internet protocol (IP) address. 
 * To contact a computer on the Internet, you send a message to the computer’s IP address. Here are some typical IP addresses:
 * 216.27.6.136 224.0.118.62
 * There are different formats for displaying IP addresses, but the most common format is the dotted decimal format.
 * The above two IP addresses use the dotted-decimal format. 
 * It’s called “dotted” because dots are used to split up the big IP address number into four smaller numbers. 
 * It’s called “decimal” because decimal numbers are used (as opposed to binary) for the four smaller numbers. 
 * Each of the four smaller numbers is called an octet because each number represents eight bits (oct means eight). 
 * For example, the 216 octet represents 11011000 and the 27 octet represents 00011011. 
 * Implement an IpAddress class that stores an IP address as a dotted-decimal string and as four octet ints.
 * You must implement all of the following:
 * Instance variables:
 * dottedDecimal – a dotted-decimal string. Example value: “216.27.6.136”
 * firstOctet, secondOctet, thirdOctet, fourthOctet – four int variables that store the octets for an IP address
 * Constructor:
 * This constructor receives one parameter, a dotted-decimal string. 
 * You may assume that the parameter’s value is valid (i.e., no error checking required). 
 * The constructor initialises the instance variables with appropriate values. 
 * There are many ways to solve the problem of extracting octets from the given dotted-decimal string. 
 * We recommend that you use String methods to extract the individual octets as strings, and then use parseInt method calls to convert the octet strings to ints.
 * getDottedDecimal method:
 * this is a standard accessor method that simply returns the dottedDecimal instance variable’s value.
 * getOctet method:
 * This method receives the position of one of the octets (1, 2, 3, or 4) and returns the octet that’s at that position. 
 * Provide a driver class that tests your IpAddress class. 
 * Your driver class should contain this main method:
 * (Score 2)
 */

/**
 *
 * @author apple
 */
class IpAddress { // score 2
    private String dottedDecimal;
    private int firstOctet;
    private int secondOctet;
    private int thirdOctet;
    private int fourthOctet;
    public IpAddress(){    
    }
    public IpAddress(String dd){
        this.dottedDecimal = dd;
        String[] str = dd.split("\\.");
        this.firstOctet = Integer.parseInt(str[0]);
        this.secondOctet = Integer.parseInt(str[1]);
        this.thirdOctet = Integer.parseInt(str[2]);
        this.fourthOctet = Integer.parseInt(str[3]);
    }
    
    public String getDottedDecimal(){
        return dottedDecimal;
    }
    public int getFirstOctet(){
        return firstOctet;
    }
    public int getSecondOctet(){
        return secondOctet;
    }
    public int getThirdOctet(){
        return thirdOctet;
    }
    public int getFourthOctet(){
        return fourthOctet;
    }
    public int getOctet(int o){
        System.out.println("Please enter a number between 1-4 to get an octet: ");
        if (o == 1)
             return getFirstOctet();
        else if(o == 2)
            return getSecondOctet();
        else if(o == 3)
            return getThirdOctet();
        else if(o == 4)
            return getFourthOctet();
        else
            System.out.println("Error:invalid number!");
        return -1;
     }
    public void setFirstOctet(int firstOctet){
        this.firstOctet = firstOctet;
    }
    public void setSecondOctet(int secondOctet){
        this.secondOctet = secondOctet;
    }
    public void setThirdOctet(int thirdOctet){
        this.thirdOctet = thirdOctet;
    }
    public void setFourthOctet(int fourthOctet){
        this.fourthOctet = fourthOctet;
    }
    public void setDottedDecimal(String dottedDecimal){
        this.dottedDecimal = dottedDecimal;
    }	
   
    public static void main(String[] args) {
        // TODO code application logic here
        IpAddress ip = new IpAddress("216.27.6.136");
        System.out.println(ip.getDottedDecimal());
        System.out.println(ip.getOctet(4));
        System.out.println(ip.getOctet(1));
        System.out.println(ip.getOctet(3));
        System.out.println(ip.getOctet(2));   
    }    
}


/* Question 4
 * Design a simple registration system that allows Student to register in a course using 2 classes: class Student & class Course. 
 * Implement the scenarios in class Test’s main method.
 * Each student has a name and an id variables. 
 * Each object of class Student is initialised using values of name and id passed to constructor. 
 * Class Student has accessor methods for its instance variables
 * Each Course has a name, and a variable numberOfStudent representing the number of registered students. 
 * A course can have a maximum number of 10 students registered in it. 
 * Class Course store the registered students in students which is an array of type Student. 
 * When a student register in a course, he is added to the array. 
 * Each object of class Course is initialised using the title. 
 * Class Course has the following methods: 
   * method getStudents(): return the array of registered students; 
   * method boolean isFull(): return true if the course is full;
   * accessor method for the title and numberOfStudent field;
   * method registerStudent (Student student): if the course is not full, register a student in course. (Score 2)
 */

/**
 *
 * @author apple
 */
class Student {
    private int id;
    private String name;
    public Student(){  
    }
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void setID (int id){
        this.id = id;
    }
    public void  setName (String name){
        this.name =  name;
    }
    public int getID(){
       return id;
    }
    public String getName(){
        return name;
    }
}

class Course {
    private String title;
    private int numberOfStudent;
    private int numMax =  10;
    private Student[] students =new Student[numMax];
    public Course(){
    }
    public Course(String title){
        this.title = title;
    }
    public void setStudents(Student[] students){
        this.students = students;
    }
    public Student[] getStudents(){
        return students;
    }
    public boolean isFull(){
        return this.numberOfStudent > numMax;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setNumberOfStudent(int numberOfStudent){
        this.numberOfStudent = numberOfStudent;
    }
    public int getNumberOfStudent(){
        return numberOfStudent;
    }
    public void registerStudent(Student student) { // you have to check if a student is already registered in the course and then register
        if (!isFull()){
            for(int i = 0; i < numMax; i++){ // you can just add student at numberOfStudent index
                if (null == students[i]){
                    students[i] = student;
                    numberOfStudent++;
                    return;   
                }
            }
        }
        else{
            System.out.println("Sorry! The number of registered is already the Max, please try another course!");
        }
    }
	
    public void registerListShow(){
        System.out.println("Course.title: " + this.title + " " + "Number of the students registerd: "+ this.numberOfStudent);
        System.out.println("The registered list is: ");
        for (int i = 0; i < numMax;i++){
            if(students[i] != null){
                System.out.println("Student ID:  " + students[i].getID() + " " + "Student Name: " +students[i].getName());
            }
        }
    }
}
	    
	    
/* Qustion 5
 * Given an integer, convert it to a roman numeral.
 * Input is guaranteed to be within the range from 1 to 3999.(Score 2) 
 */	    

/**
 *
 * @author apple
 */
public class intToRoman { // score 2
    /**
     * @param args the command line arguments
     * @return 
     */
    public static String intToRoman(int num){
            String digit[] = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
            String ten[] = {"","X","XX","XXX","XL","L","L","LX","LXX","LXXX","XC"};
            String hundred[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
            String thousand[] = {"","M","MM","MMM"};
            String roman = "";
            return roman + thousand[num/1000] + hundred[num%1000/100] + ten[num%100/10] + digit[num%10];
    }
                      
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(intToRoman(1234));    
    }   
}


/* Question Extra1
 * There are two sorted arrays nums1 and nums2 ofsize m and n respectively.
 * Find the median of the two sorted arrays. (Score 2)
 *
 * Example 1:
 * nums1 = [1, 3] nums2 =[2] The median is 2.0
 * Example 2:
 * nums1 = [1, 2] nums2 =[3, 4] The median is (2+3)/2 = 2.5
 */

/* My thoughts：
 * To find the median of the sorted arrays, this issue can be converted to finding Kth element.
 * And K = (nums1.length + nums2.length) / 2
 * The nums1 array: a0,a1,...ak/2-1,ak/2,...am-1, let the first k/2 elements be the Section1.
 * The nums2 array: b0,b1,...bk/2-1,bk/2,...bn-1, let the first k/2 elements be the Section2.
 * If ak/2-1 > bk/2-1, drop Section2 & Search (k-k/2)th in the rest.
 * If ak/2-1 < bk/2-1, drop Section1 & Search (k-k/2)th in the rest.
 */

/**
 *
 * @author apple
 */
public class FindMedianSortedArrays { // extra credit 2
    /**
     * @param args the command line arguments
     * @return 
     */	
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int total = nums1.length + nums2.length;
        if(total % 2 == 0){
            return (findKth(total/2+1, nums1, nums2, 0, 0) + findKth(total/2, nums1, nums2, 0, 0))/2.0;
        }
        else{
            return findKth(total/2+1, nums1, nums2, 0, 0);
        }
    }

    public int findKth(int k, int[] nums1, int[] nums2, int s1, int s2){
        if(k == 1)
            return Math.min(nums1[s1], nums2[s2]);
        else if(s1 >= nums1.length)
            return nums2[s2+k-1];
        else if(s2 >= nums2.length)
            return nums1[s1+k-1];
    
        int n1 = s1+k/2-1;
        int n2 = s2+k/2-1;
        int mid1 = n1 < nums1.length ? nums1[n1] : Integer.MAX_VALUE;
        int mid2 = n2 < nums2.length ? nums2[n2] : Integer.MAX_VALUE;
        if(mid1 < mid2){
            return findKth(k-k/2, nums1, nums2, n1+1, s2);
        }
        else{
            return findKth(k-k/2, nums1, nums2, s1, n2+1);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums1 = {1,3,5,7,9};
	int[] nums2 = {2,4,6,8,10};
	System.out.println(findMedianSortedArrays(nums1,nums2));    
    }
}
	
