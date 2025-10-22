abstract class Character {
    protected String name;
    protected int hp;
    protected int baseDamage;

    public Character(String name, int hp, int baseDamage) {
        this.name = name;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }

    // Hàm tấn công trừu tượng (mỗi lớp con sẽ tự triển khai)
    public abstract void attack();
}

// ===============================
// Các lớp con kế thừa Character
// ===============================

class Warrior extends Character {
    public Warrior(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }

    @Override
    public void attack() {
        System.out.println(name + " (Warrior) attacks with a sword!");
    }
}

class Archer extends Character {
    public Archer(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }

    @Override
    public void attack() {
        System.out.println(name + " (Archer) shoots an arrow!");
    }
}

class Mage extends Character {
    public Mage(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }

    @Override
    public void attack() {
        System.out.println(name + " (Mage) casts a fireball!");
    }
}

class ArcaneArcher extends Character {
    public ArcaneArcher(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }

    @Override
    public void attack() {
        System.out.println(name + " (ArcaneArcher) shoots an arrow!");
        System.out.println(name + " also casts a magic spell!");
    }
}

// ===============================
// Hàm main chạy chương trình
// ===============================
public class baitap {
    public static void main(String[] args) {
        Character[] characters = {
                new Warrior("Arthur", 100, 15),
                new Archer("Legolas", 80, 12),
                new Mage("Gandalf", 70, 20),
                new ArcaneArcher("Sylvanas", 90, 18)
        };

        // Cho từng nhân vật tấn công
        for (Character c : characters) {
            c.attack();
        }
    }
}
