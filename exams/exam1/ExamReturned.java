package exam1;

/*  * __ [-1] Needed to fix a compilation problem in the codepublic class ExamTemplate {
	

/* Question 1: 30

* _x_ [+30 points] Code produces correct output (check q1.txt) and contains a loop.

* Otherwise, check off as many of these as applicable:

* __ [+4] An int array of size 50 is present
* __ [+4] "Assignment statements for the answer[0] answer[1] answer[2] are present"
* __ [+4] A for loop or a while loop with a correctly initialized and updated count variable is present
* __ [+4] A for loop or equivalent while loop that goes to i<50 is present
* __ [+4] Correctly handled array indexing to avoid array out of bounds errors
* __ [+4] The correct recurrence relation is present ( answer[i] = answer[i-2] + answer[i-3] )
*/

	public static int[] question1() {
		// feel free to modify the declaration of answer as necessary
		int[] answer = new int[50];
	    answer[0]=3;
	    answer[1]=0;
	    answer[2]=2;
	    for(int i=3;i<=49;i++){
	    	answer[i]=answer[i-2]+answer[i-3];
	    }
	    		
		// don't change the return statement
		return answer;
	}
	

/* Question 2: 10

* _x_ [+10 points] Code produces correct output (check q2.txt) and contains two for loops or equivalent while loops

* Otherwise, check off as many of these as applicable:

* __ [+2] A for loop or while loop with a correctly initialized and updated count variable is present
* __ [+2] Two nested for loops or equivalent while loops are present
* __ [+2] Array bounds are used appropriately (inner loop variable j cannot be 0 or 1)
* __ [+2] i%j check to determine prime status is present
*/

	public static boolean[] question2() {
		// feel free to modify the declaration of answer as necessary
		boolean[] answer = new boolean[50];
		answer[0]=false;
		answer[1]=true;
				answer[2]=true;
		for(int i=3;i<=49;i++ ){
			answer[i]=true;
			for(int j=2;j<=i-1;j++){
				if(i%j==0){
					answer[i]=false;
				}
			}
		}

		// don't change the return statement
		return answer;
	}
	

/* Question 3: 30

* _x_ [+30] Code produces correct output (check q3.txt) and contains a while loop and does not contain 21.

* Otherwise, check off as many of these as applicable:

* __ [+4] A sum variable is defined and initialized to zero
* __ [+4] A while loop is present
* __ [+4] While loop condition is sum < 1000
* __ [+4] Sum is being updated appropriately
* __ [+4] Count initialized to 0 and 1 is added each loop iteration
* __ [+4] Sum variable added to appropriately each loop iteration
*/

	public static int question3() {
		// feel free to modify the declaration of answer as necessary
		int answer = 0;
		
		// you may want to use your answer from question 1 in answering this question
		int[] question1Answer = question1();
		int sum=0;
		for(answer=0;answer<=49;answer++){
			sum=sum+question1Answer[answer];
			if(sum>1000){
				break;
			}
		}
		answer=answer+1;
		
		// don't change the return statement
		return answer;
	}
	

/* Question 4: 29

* _x_ [+30] Code produces correct output (check q4.txt) and contains a for loop or equivalent while loop.
* _x_ [-1] We corrected a minor typo in your output string
* Otherwise, check off as many of these as applicable:

* __ [+4] An int array of size 50 is present
* __ [+4] A for loop or while loop with a correctly initialized and updated count variable is present
* __ [+4] A for loop or equivalent while loop that goes to i<50 is present
* __ [+4] If statement is present
* __ [+4] If statement condition is question2Answer[i] == true or appropriate equivalent
* __ [+4] String assignment statement uses question1Answer[i] to print perrin value
*/

	public static String[] question4() {
		// feel free to modify the declaration of answer as necessary
		String[] answer = new String[50];
		
		// you may want to use your answer from questions 1 and 2 in answering this question
		int[] question1Answer = question1();
		boolean[] question2Answer = question2();
		for(int i=0;i<=49;i++){
			if(question2Answer[i]==true){
				answer[i]=i+" is PRIME: "+question1Answer[i]+"%"+i+"=0";
			}
		}
			for(int j=0;j<=49;j++){
				if(question2Answer[j]==false){
					answer[j]=j+" is NONPRIME";
				}
		}
		// don't change the return statement
		return answer;
	}

	public static void main(String[] args) {
		/*
		 * NOTE: 
		 * You should not change and should not need to change any of the code below.
		 * It's there just to make it easy for you to see and verify the accuracy of
		 * your answers.
		 */
		int[] question1Answer = question1();
		boolean[] question2Answer = question2();
		int question3Answer = question3();
		String[] question4Answer = question4();
		
		// print all of the answers
		System.out.println("QUESTION 1 ");
		for (int i = 0; i < question1Answer.length; i++) {
			System.out.print( question1Answer[i] + ", ");
		}
		System.out.println();
		System.out.println();
		
		// print the i's where the value is TRUE
		System.out.println("QUESTION 2 ");
		for (int i = 0; i < question2Answer.length; i++) {
			if (question2Answer[i] == true) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.println("QUESTION 3: " + question3Answer);
		System.out.println();
		System.out.println();
		
		
		// print out all answers
		System.out.println("QUESTION 4 ");
		for (int i = 0; i < question4Answer.length; i++) {
			System.out.println(question4Answer[i]);
		}

	}

}
