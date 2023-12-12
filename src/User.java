public class User {

    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalNameException {
        if (name.length() >  20) {
            throw new IllegalNameException("Ошибка. Имя пользователя не может быть " +
                    "больше 20 символов. Вы задали " + name);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0 || age >= 120){
            throw new IllegalAgeException("Ошибка. Возраст пользователя не может быть " +
                    "больше 120 или меньше 0. Вы задали " + age);
        }
        this.age = age;
    }
}
