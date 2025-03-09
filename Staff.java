public class Staff implements Comparable<Staff>{
    private int staffID;
    private int height;
    private String name;
    private int age;
    private static int sortingChoice; // if sorting choice is 1, then sort based on staffID

    Staff(){
        staffID = 0;
        height = 160; // imagine cm
        name = "default";
        age = 21; 
        sortingChoice = 1;
    }

    Staff(int staffID, int height, String name, int age){
        this.staffID = staffID;
        this.height = height; 
        this.name = name; 
        this.age = age; 
        sortingChoice = 1; 
    }
    
    public static void setSortingChoice(int choice){
        sortingChoice = choice;
    }

    public int getSortingChoice(int sortingChoice){
        return sortingChoice;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getHeight(){
        return height;
    }

    public int getStaffID(){
        return staffID;
    }

    @Override
    public int compareTo(Staff otherStaff) {
        // TODO change this code to compare the attributes of this local
        // object to the object above (the variable called o)

        switch (sortingChoice) {
            case 1: // compare staff numbers
                return staffID - otherStaff.getStaffID();
            case 2: // compare staff names
                return name.toLowerCase().compareTo(otherStaff.getName().toLowerCase());
            case 3: // compare height
                return height - otherStaff.getHeight();
            case 4: // compare age
                return age - otherStaff.getAge();
            default: // compare staffID
                return staffID - otherStaff.getStaffID();
        }

        


    }

    @Override
    public String toString(){
        return name; 
    }
}
