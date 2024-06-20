package animal;


public class MainAnimal {
    public static void main(String[] args) {

    	
    	// '->' arrow is used for implementation
    	
        // Code in shorter syntax/lines:
        Animal dog = noise -> noise;
        System.out.println(dog.makeNoise("bark"));

        /* Actual code:
        Animal dog = new Animal() {
            @Override
            public String makeNoise(String noise) {
                return noise;
            }
        };
        System.out.println(dog.makeNoise("bark"));
        */

        //Code in shorter syntax/lines
        Animal cat = noise -> noise;
        System.out.println(cat.makeNoise("meow"));

        /*
        Animal cat = new Animal() {
            @Override
            public String makeNoise(String noise) {
                return noise;
            }
        };
        System.out.println(cat.makeNoise("meow"));
        */

        //Code in shorter syntax/lines
        Animal snake = noise -> noise;
        System.out.println(snake.makeNoise("hiss"));
        /*
        Animal snake = new Animal() {
            @Override
            public String makeNoise(String noise) {
                return noise;
            }
        };
        System.out.println(snake.makeNoise("hiss"));
        */
    }
}