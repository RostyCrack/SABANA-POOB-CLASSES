public class Cat extends Animal implements IPet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String greeting() {
        return "Miau mIAU";
    }


    @Override
    public boolean roll() {
        return false;
    }

    @Override
    public String sayLoveYourMaster(String masterName) {
        return String.format("I love my master %s, but I don't like it when he touches me", masterName);
    }

    @Override
    public boolean eat() {
        System.out.println("I'm gonna eat but because I want to... not beacuse you asked");
        return true;
    }
}
