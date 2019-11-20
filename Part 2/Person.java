public class Person{
        private String name;
        private char gender;
        private int age;

        public Person(String name, char gender, Integer age){
                this.name = name;
                this.gender = gender;
                this.age = age;
        }

        // returns the name
        public String getName() {
                return name;

        }

        // returns gender
        public char getGender() {
                return gender;

        }

        //Sets age
        public void setAge(int age) {

        }

        //returns age
        public int getAge() {
                return age;

        }

}
