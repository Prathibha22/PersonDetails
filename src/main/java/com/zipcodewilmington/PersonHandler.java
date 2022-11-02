package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
       StringBuilder sb=new StringBuilder();
        // create a `counter`
        int counter=0;
        // while `counter` is less than length of array
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
        while (counter< personArray.length){
         sb.append("\nMy first name is " +personArray[counter].getFirstName()+ "\n" + "My last name is "
                 +personArray[counter].getLastName());
         counter++;
        }
            // end loop
        return sb.toString();
    }

    public String forLoop() {
        StringBuilder sb = new StringBuilder();
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        for (int counter = 0; counter < personArray.length; counter++) {
            sb.append("\nMy first name is " +personArray[counter].getFirstName()+ "\n" + "My last name is "
                    +personArray[counter].getLastName());
        }

        // end loop

        return sb.toString();
    }

    public String forEachLoop() {
        StringBuilder sb=new StringBuilder();
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
        for(Person name:personArray)
        sb.append("\nMy first name is " +name.getFirstName()+ "\n" + "My last name is "
                +name.getLastName());
            // end loop

        return sb.toString();
    }
    public Person[] getPersonArray() {
        return personArray;
    }
}
