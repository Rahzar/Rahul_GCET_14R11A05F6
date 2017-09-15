import java.time.LocalDateTime;

import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		if(students.length == 0)
			throw new IllegalArgumentException();
		else
		this.students = students;
	}

	@Override
	public Student getStudent(int index) {
		if(index<0 || index >= students.length)
			throw new IllegalArgumentException();
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		if(index<0 || index >= students.length || student == null)
			throw new IllegalArgumentException();
		else
		students[index] = student;
	}

	@Override
	public void addFirst(Student student) {
		if (student == null)
			throw new IllegalArgumentException();
		else
		{
		Student[] a = new Student[(students.length+1)];
		 for (int i = 0; i < students.length; i++) 
		 {
	            a[i+1] = students[i];
		 }
		 a[0]= student;
		 students = a;
		}
	}

	@Override
	public void addLast(Student student) {
		if (student == null)
			throw new IllegalArgumentException();
		else
		{
		Student[] a = new Student[(students.length+1)];
		 for (int i = 0; i < students.length; i++) 
		 {
	            a[i] = students[i];
		 }
		 a[students.length]= student;
		 students = a;
		}
	}

	@Override
	public void add(Student student, int index) 
	{
		
		if(index<0 || index >= students.length || students.length == 0)
			throw new IllegalArgumentException();
		else
		{
		Student[] a = new Student[(students.length+1)];
		 for (int i = 0; i < students.length; i++) 
		 {
			 if(i == index)
			 { a[i] = student;
			 		continue;}
			 else		
	            a[i] = students[i];
		 }
		 students = a;
		} 
		
		
		
		
		
		
		
		
	}

	@Override
	public void remove(int index) {
		if(index<0 || index >= students.length )
			throw new IllegalArgumentException();
		else
		{
		Student[] a = new Student[(students.length-1)];
		 for (int i = 0; i < students.length; i++) 
		 {
			 if(i == index)
				 continue;
			 else
	            a[i] = students[i];
		 }
		 
		 
		 students = a;
		}
	}

	@Override
	public void remove(Student student) {
		if(student == null)
			throw new IllegalArgumentException();
		else
		{
		Student[] a = new Student[(students.length-1)];
		 for (int i = 0; i < students.length; i++) 
		 {
			 if(students[i].getId() == student.getId())
				 continue;
			 else
	            a[i] = students[i];
		 }
		 
		 
		 students = a;
		}
	}

	@Override
	public void removeFromIndex(int index) {
		
		
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		 Student temp = null; 
         for(int i=0; i < students.length; i++)
         {  
                 for(int j=1; j < (students.length-i); j++)
                 {  
                          if(students[j-1].getId() > students[j].getId())
                          {  
                                 //swap elements  
                                 temp = students[j-1];  
                                 students[j-1] = students[j];  
                                 students[j] = temp;  
                          }
                 }
         }
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		
		int count =0;
		
		for(int i = 0;i < students.length;i++)
		{
			if ( students[i].getBirthDate() == date)
				
				count++;
		}
		Student[] a = new Student[count];
		for(int i=0;i < count;i++)
		{
			
		}
		
		if(date==null)
			throw new IllegalArgumentException();
		return a;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		
		if(firstDate==null || lastDate == null)
			throw new IllegalArgumentException();
		else
		
			
			return null;
		
		
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		if(date==null)
			throw new IllegalArgumentException();
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent)throws IllegalArgumentException 
	{
		int age;
		
		
		age = LocalDateTime.now().getYear() - students[indexOfStudent].getBirthDate().getYear();
		
		return age;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		if(student==null)
			throw new IllegalArgumentException();
		else
		{
			int i;
			for (i = 0; i < students.length; i++) 
			 {
				 if(students[i].getId() == student.getId())
					break;
			 }
			return students[i];
		}
		
	}
}
