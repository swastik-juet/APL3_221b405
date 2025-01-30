public class Voice {

    public void prepareVoice() {
        Animal[] animals = new Animal[5]; 
        animals[0] = new cow();
        animals[1] = new dog();
        animals[2] = new pig();
        animals[3] = new goat();
        animals[4] = new lion();

        hear(animals);
    }

    public void hear(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeVoice(); 
        }
    }
}