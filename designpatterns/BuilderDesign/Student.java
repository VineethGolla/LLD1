package BuilderDesign;

//setters(read only) and getters(write only) are independent and
// set is used to set the private attribute where in get is used to get the attributes.
//Client don't create objects. They just call it most of the times.
//I can now merge Builder inside Student then I must declare Builder as static as It was class and now it's not and Static method needs that static
//I can put exceptions thing before even calling  new student inside Build(). It means student object will not get created even if single thing fails

public class Student {
    private String Name;
    private int Age;
    private String company;
    private double psp;
    private String Batch;


    private Student(Builder builder){
//        try {
//            if (builder.getAge() < 18) {
//                throw new RuntimeException();
//            }
//            if (builder.getCompany().equals("abc")) {
//                throw new CloneNotSupportedException("Hey this is a fake company");
//            }
//        }
//        catch(CloneNotSupportedException ex){
//            System.out.println("iT'S A FAKE COMPANY");
//        }
//        catch(RuntimeException ex){
//            System.out.println("Age not met");
//        }

        this.Name = builder.getName();
        this.Age = builder.getAge();
        this.company = builder.getCompany();
        this.psp = builder.getPsp();
        this.Batch = builder.getBatch();

    }


    public static Builder getBuilder(){

        return new Builder();
    }

    //new Builder just calls the Builder's class constructor



    public String getName(){
        return Name;
    }
    public void setName(String name){
        this.Name=name;
    }
    public int getAge(){
        return Age;
    }
    public void setAge(int age){
        this.Age=age;
    }
    public String getCompany(){
        return company;
    }
    public void setCompany(String company){
        this.company=company;
    }
    public double getPsp(){
        return psp;
    }
    public void setPsp(double psp){
        this.psp=psp;
    }
    public String getBatch(){
        return Batch;
    }
    public void setBatch(String batch){
        this.Batch=Batch;
    }




    //Inner class
    //static class due to static method for getBuilder(To create builder object)

    public static class Builder {
        private String Name;
        private int Age;
        private String company;
        private double psp;
        private String Batch;

        public Student Build(){

            try {
                if (this.getAge() < 18) {
                    throw new RuntimeException();
                }
                if (this.getCompany().equals("abc")) {
                    throw new CloneNotSupportedException("Hey this is a fake company");
                }
            }
            catch(CloneNotSupportedException ex){
                System.out.println("iT'S A FAKE COMPANY");
            }
            catch(RuntimeException ex){
                System.out.println("Age not met");
            }


            return new Student(this);
        }
        public String getName(){
            return Name;
        }
        public Builder setName(String name){
            this.Name=name;
            return this;
        }
        public int getAge(){
            return Age;
        }
        public Builder setAge(int age){
            this.Age=age;
            return this;
        }
        public String getCompany(){
            return company;
        }
        public Builder setCompany(String company){
            this.company=company;
            return this;
        }
        public double getPsp(){
            return psp;
        }
        public Builder setPsp(double psp){
            this.psp=psp;
            return this;
        }
        public String getBatch(){
            return Batch;
        }
        public Builder setBatch(String batch){
            this.Batch=Batch;
            return this;
        }
    }

}
