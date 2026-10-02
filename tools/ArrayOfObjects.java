class ArrayOfObjects{
    int roll;
    String name;
    int marks;

    public static void  main(String args[]){

        ArrayOfObjects s1 = new ArrayOfObjects();
        s1.roll=1;
        s1.name="Tushar";
        s1.marks=99;

        ArrayOfObjects s2 = new ArrayOfObjects();
        s2.roll=2;
        s2.name="Akib";
        s2.marks=98;

        ArrayOfObjects s3 = new ArrayOfObjects();
        s3.roll=3;
        s3.name="Samir";
        s3.marks=19;

        ArrayOfObjects stud[] = new ArrayOfObjects[3];

        stud[0]=s1;
        stud[1]=s2;
        stud[2]=s3;

        // for(int i = 0; i < stud.length; i++){
        //     System.out.println(stud[i].name + ":" + stud[i].marks);
        // }

        for(ArrayOfObjects s : stud){
            System.out.println(s.name + ":" + s.marks);
        }
    }
}