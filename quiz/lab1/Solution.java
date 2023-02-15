
package quiz.lab1;
public class Solution  {
    public static void main(String[] args) {
        testCase1();
        testCase2();
        testCase3();
        testCase4();
        testCase5();
    }
    
    private static boolean compareLists(SinglyLinkedList<Integer> list1, SinglyLinkedList<Integer> list2){
        if(list1.size()==list2.size()){
            Node<Integer> n1=list1.first();
            Node<Integer> n2=list2.first();
            while(n1!=null&&n2!=null){
                if (n1.getElement()!=n2.getElement()){
                    return false;
                }
                n1=n1.getNext();
                n2=n2.getNext();
            }
            return true;
        }

        return false;
    }
//       
//        while((list1!=null && list2!=null) && list1.getElement() == list2.head){
//            list1 = list1.tail;
//            list2 = list2.tail;
//        }
//        return (list1 == null && list2 == null);
//    
        
        
    

    private static void testCase1() {
        System.out.println("Test case number #01");
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();
        System.out.println("list1: "+list1);
        System.out.println("list2: "+list2);
        String result=compareLists(list1,list2)==true?"success":"fail";
        System.out.println("test case result: "+result);
        System.out.println("------------------------------");
    }
    private static void testCase2() {
        System.out.println("Test case number #02");
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
        list1.addLast(new Node<>(1));
        list1.addLast(new Node<>(3));
        list1.addLast(new Node<>(7));
        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();
        list2.addLast(new Node<>(1));
        list2.addLast(new Node<>(3));
        list2.addLast(new Node<>(7));
        System.out.println("list1: "+list1);
        System.out.println("list2: "+list2);
        String result=compareLists(list1,list2)==true?"success":"fail";
        System.out.println("test case result: "+result);
        System.out.println("------------------------------");
    }
    private static void testCase3() {
        System.out.println("Test case number #03");
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
        list1.addLast(new Node<>(1));
        list1.addLast(new Node<>(3));
        list1.addLast(new Node<>(7));
        list1.addLast(new Node<>(10));
        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();
        list2.addLast(new Node<>(1));
        list2.addLast(new Node<>(3));
        list2.addLast(new Node<>(7));
        System.out.println("list1: "+list1);
        System.out.println("list2: "+list2);
        String result=compareLists(list1,list2)==false?"success":"fail";
        System.out.println("test case result: "+result);
        System.out.println("------------------------------");
    }
    private static void testCase4() {
        System.out.println("Test case number #04");
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
        list1.addLast(new Node<>(1));
        list1.addLast(new Node<>(3));
        list1.addLast(new Node<>(7));
        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();
        list2.addLast(new Node<>(1));
        list2.addLast(new Node<>(3));
        list2.addLast(new Node<>(7));
        list2.addLast(new Node<>(12));
        System.out.println("list1: "+list1);
        System.out.println("list2: "+list2);
        String result=compareLists(list1,list2)==false?"success":"fail";
        System.out.println("test case result: "+result);
        System.out.println("------------------------------");
    }
    private static void testCase5() {
        System.out.println("Test case number #05");
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
        list1.addLast(new Node<>(1));
        list1.addLast(new Node<>(5));
        list1.addLast(new Node<>(7));
        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();
        list2.addLast(new Node<>(1));
        list2.addLast(new Node<>(3));
        list2.addLast(new Node<>(7));
        System.out.println("list1: "+list1);
        System.out.println("list2: "+list2);
        String result=compareLists(list1,list2)==false?"success":"fail";
        System.out.println("test case result: "+result);
        System.out.println("------------------------------");
    }
}