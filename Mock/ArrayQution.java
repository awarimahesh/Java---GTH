Q1. What is an Array in Java and explain with syntax and examplein

->in java Array is String similar Data types and Sequtioal format is called array

Q2. Explain how many ways we can declare arrays in Java?

->1)declartion
	int arr[];
	
	2)declarion and memory allocation
	int arr[]=new int[5];
	
	3)declartion and initillization.
	int arr[]={10,20,30,40};


Q3. Explain the types of arrays in Java?

->three types
	1)one Dimensional array.
	2) two D array.
	3) Multi D Array.




Q4. How to initialize an array in Java?

-> int arr[]= new int[5];
using new  Key word.


Q5. How is an array different from normal variables in Java?
 
			Array							Normal variable
	1) int[] arr = {10,20,30};				int a=10;
	2) countinus memory allocate			Singal memory allocate
	3)multiple vallue storing                singal value stooring
	4)its access index value                Direct varible name se.



Q6. Can an array store different data types in Java? Explain.
-> NO 
onlay string the only one data type value but string multiple vale but one datat type.
	
Type safety-> int arr[]={10,20,"Mahesh"}//compile time error becose array is int type and value char.
	
	Object[] arr = {10, "Hello", 3.14, true}; allow karta hee.
	







Q7. What is the memory allocation process for arrays in Java?

-> array always storing heap memory
int arr[]=new int[5]; 

	-arr is refrance variable it is in stack memory.
	-JVM heap memory  5 integer blocks allocate
	-jvm each element  initializ default value .
	
	In Java, arrays are objects and memory is allocated in heap memory,
	while their reference variables are stored in stack memory.
	JVM initializes array elements with default values
	
	
	
Q8. What is the difference between declaration, instantiation, and initialization of an array?

-> declaration            			instantiation                        initialization
	Array veraible declear			memory allocation                     value assign
	no memory                       memory                                allredy memory 
	no new key word                  new keyword                            no
	int arr[]                        a=new int[5]                          int[0]=20; 	 	
	
	


Q9.  Can we change the size of an array after declaration? Why or why not?
-> NO

whay=becous array storing continus memory allocation
its allocate continus memory allocte in heap
Java में arrays static in size होते हैं

Memory allocation compile/run time पर fix हो जाता है

3️⃣ नया array बनाना ही solution है

अगर size change चाहिए, तो:

नया array बनाना पड़ेगा

पुराने array की values copy करनी होंगी







Q10. What is the difference between a static array and a dynamic array?

	Static array                                         dynamic array
	1) Fix Size                                           changable
	2) direct use                                         array list use see
	3) fix block of memeory                               dynnamic memory block
	4) fast                                                sloww
	5) less flexible                                       more felxibleshrink and expand
	
	
	





Q11. How does the JVM store array elements internally?


	int[] arr = new int[5];
	using object and that object store in an
	stack mee memory ka refrance store 
	ten after continous memory alloction


Q12. What is the difference between .length, .length() and .size() in Java?

	.length-> array size / length  verible 
	.length()-> String length /size    ()method
	.size()->(ArrayList, HashSet,) size       ()method





Q13. Can an array of size zero exist in Java? If yes, give an example.
	->Yes
	int[] arr = new int[0];
	System.out.println(arr.length);  // Output: 0
	
	Java में array एक object होता है
	JVM को array का size 0 देना allowed है
	Zero-size array heap memory में बनता है,
	लेकिन उसमें कोई element नहीं होता



Q14. What is the difference between shallow copy and deep copy of an array?

	->shallow copy                                       deep cop
	
	in shallow copy are not creating new array.
    oly one copy refrance                                in deep copy are creating new array
	but element are point same meory   					no affect in orignal array
		

	int[] arr1 = {10, 20, 30};                          int[] arr1 = {10, 20, 30};           
	int[] arr2 = arr1;   // shallow copy                int[] arr2 = new int[arr1.length];

	arr2[0] = 100;										for(int i = 0; i < arr1.length; i++) {
	System.out.println(arr1[0]); // 100							arr2[i] = arr1[i];
	.                                                               }

Q15. What is the use of the Arrays class in Java?

	->array class using the comman opration in array 
	this class in java.util package
	uses Sorting ,Serching, printing ,comapring 


	

Q16. Explain how array memory is allocated in the heap.

	तो JVM यह काम करती है:
	Heap memory में एक array object create होता है
	Stack memory में arr नाम का reference variable बनता है
	arr heap में बने array object को point करता है
	
	2️⃣ Heap Memory Allocation

	Heap में:

	Array के लिए continuous memory block allocate होता है
	हर element के लिए equal size की memory होती है
	Total memory = array length × data type size


Q17. Can arrays be declared as final in Java? What does that mean?

-> yes Array declear final
but after declering arry not change size with using refrance 




Q18. What are the limitations of arrays in Java?
ther are storing continus memory
its  fix size  memory west 
memory less overflowing problem 

Same datat type using only 

no built in methods

its is no runtime pe growing or shrinking ;
on direct change ->becose change is creating new array and after deleting 
The main limitations of arrays in Java are fixed size, same data type restriction,
 lack of built-in methods, and inefficient 
insertion and deletion operations.






Q19. Can we create an array of references in Java? Give an example.
-->yes
	becose arry lement are not premative they are object refrances so thats whay arry object 
	refrance 
	example :String name[]=new String[3]
			name[0]="MAhesh";
			
			each element are String object refrance
			






Q20.What is the base address in an array? Explain in depth.

base addres-->base addres mins array staring addres=base addres.
				index(0) pe base addres 
				the base address of an array is the memory address of its first element.

			elemnt access ke liye useful
			Base Address + (i × Size of data type)





Q21. What is the default value of an array in Java?
	in java create array so jvm Automatically  set default value
		defult value depnds on Data type.
		
		Data Type	Default Value
				byte	0
				short	0
				int		0
				long	0L
				float	0.0f
				double	0.0
				char	'\u0000'
				boolean	false
				Reference / Object	null





Q22. Is it possible to declare array size as negative?

-->No
	int[] arr = new int[-5];
	it is complie but 
	but runtime pe exception throw --> NegativeArraySizeException

	-->size evalute in runtime but compile not acctul value thats whay
	
	



Q23. When does an ArrayIndexOutOfBoundsException occur in Java?
	--> becous array memory alloction fix sized valid index ke bahar kisi elemnt ko access 
	karne ke vajse
	
	Loop condition
	Negative Index use
	Index jaad hone par
	








Q24. What are the advantages and disadvantages of using arrays in Java?

-->       Addavantages                                  DisAdvantages
          FastAcces                                     Fixed Size
		  Storing Multiple value                        Same Data Type Restriction
		  Easy Traversal                                No Built-in Methods
			M                                           nsertion & Deletion Costly









Q25. What happens when we assign one array to another (e.g., arr2 = arr1)?
-->
		Stack              Heap
		-----              -----
		arr1 ───────┐
					├──▶ [10][20][30]
		arr2 ───────┘

same memory loction are pointing to same arry
ther are change one arry so affected in (Shalloy copy)/rafrance copyy

int[] arr1 = {10, 20, 30};
int[] arr2 = arr1;   // reference assignment

arr2[0] = 100;

System.out.println(arr1[0]); // Output: 100
System.out.println(arr2[0]); // Output: 100


Q26 What is function?
--> function is a block of statement wich is use for writing a logic and 
we can reuse more than one time.

Q27 . What is the use  function or What are the benefits of function?
-->Reusability : reusability means we can define a function more than once and we 
		can reuse it more than means we can write logic only one time and we can reuse it more 
		than one time by calling a function.

Modularity : modularity means we can divide the large logics into sub functions and integrate
			them internally called as modularity 

Types of function 
Built in function : Built in function means those functions already provided by java to 
					us called as built in function or library function.
					E.g nextInt(),nextFloat(), nextDouble(),Math.pow() etc 
User Defined function : user defined function means those function defined by user
					for its own work called as user defined function.

Q28 Stack : Stack is a data structure which is used for arrange data in last in first out format 
Means last added data remove first and first added data remove last 
Stack is a single ended data structure means we can remove data from stack at the same end 
and can store data in stack using the same end.
Stack has one pointer  known as top and initially top is -1 and using top we can store data in 
stack and remove data from stack.
