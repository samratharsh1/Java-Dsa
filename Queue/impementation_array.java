

// Yeh class hai queue ko array se implement karne ke liye
class impementation_array {
    // Yeh inner class hai queue ke operations ke liye
    static class Queue{
        // Yeh array hai jisme queue ke elements store honge
        static int arr[];
        // Yeh queue ki maximum size hai
        static int size;
        // Yeh rear pointer hai, last element ka index
        static int rear;
        // Constructor hai queue ko initialize karne ke liye
        Queue(int  n){
            // Array create kar rahe hain size n ke saath
            arr=new int[n];
            // Size set kar rahe hain
            size=n;
            // Rear ko -1 se initialize kar rahe hain, empty queue ke liye
            rear=-1;
        }
        // Yeh method check karta hai ki queue empty hai ya nahi
        public static boolean isEmpty(){
            // Agar rear -1 hai to empty hai
            return rear==-1;
        }

        // Yeh method queue mein element add karta hai
        public static void add(int data){
            // Agar rear last index pe hai to queue full hai
            if(rear==size-1){
                // Message print karo
                System.out.println("queue is full");
                // Function se bahar nikal jao
                return;
            }
            // Rear ko ek badhao
            rear =rear+1;
            // Data ko rear position pe daalo
            arr[rear]=data;
        }
        // Yeh method queue se front element remove karta hai
        public static int remove(){
            // Agar queue empty hai to
            if (isEmpty()){
                // Message print karo
                System.out.println("empty queue");
                // -1 return karo
                return -1;
            }
            // Front element ko store karo
            int front=arr[0];
            // Loop chalao rear tak
            for(int i=0;i<reear;i++){
                // Elements ko left shift karo
                arr[i]=arr[i+1];
            }
            // Rear ko ek kam karo
            rear =rear -1;
            // Front element return karo
            return front;
        } 
        // Yeh method front element dekhne ke liye hai
        public static int peek(){
            // Agar empty hai to
            if(isEmpty()){
                // Message print karo
                System.out.println("empty queue");
                // -1 return karo
                return -1;
            }
            // Front element return karo
            return arr[0];

        }
        
    }
    
    
    // Main method hai program run karne ke liye
    public static void main(String[] args) {
        // Queue object banao size 5 ke saath
        Queue q=new Queue(5);
        // 9 add karo
        q.add(9);
        // 5 add karo
        q.add(5);
        // 2 add karo
        q.add(2);
        // 0 add karo
        q.add(0);
        // 10 add karo
        q.add(10);

        // Jab tak queue empty nahi hota
        while(!q.isEmpty()){
            // Front element print karo
            System.out.println(q.peek());
            // Remove karo
            q.remove();
        }
        
    }
    
}