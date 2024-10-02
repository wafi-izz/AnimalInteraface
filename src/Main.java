public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.sleep();

        Animal dog = new Dog();
        dog.workout();
    }
}
interface Animal {
    void eat();
    void drink();
    void sleep();
    void workout();
}
class Cat implements Animal {
    public String name;
    public Cat() {
        name = "cat";
    }
    @Override
    public void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    public void drink() {
        System.out.println(name + " is drinking");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    @Override
    public void workout() {
        System.out.println(name + " is working out");
    }
}

class Dog implements Animal {
    public String name;
    public Dog() {
        name = "cat";
    }
    @Override
    public void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    public void drink() {
        System.out.println(name + " is drinking");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    @Override
    public void workout() {
        System.out.println(name + " is working out");
    }
}


//create interface and push codes to github
//
//        a. Create Animal interface and it should have eat, drink, sleep, workout functions in the interface.
//
//b. create a Github repo and send all your codes to there.
//
//        Note: You can use Chatgpt but before chat gpt I suggest you to use other tools and understand better