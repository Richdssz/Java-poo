package ListasDeAtividades.Lista02;

import java.util.ArrayList;

public class Zoologico {
    private ArrayList<Animal> animais;

    public Zoologico() {
        this.animais = new ArrayList<>();
    }

    public ArrayList<Animal> listarAnimais() {
        return this.animais;
    }

    public Animal buscarAnimal(long id) {

        for (int i = 0; i < animais.size(); i++) {

            if (this.animais.get(i).getId() == id) {
                return animais.get(i);
            }
        }

        return null;

    }

    public boolean removerAnimal(long id) {

        for (int i = 0; i < animais.size(); i++) {

            if (this.animais.get(i).getId() == id) {
                this.animais.remove(i);
                return true;
            }
        }
        return false;

    }

    public boolean adicionarAnimal(Animal animal) {
        // se ele chama o buscarAnimal e procura pelo id, se o id existir
        // ele retorna o objeto animal do Arraylist do Zoológico
        // se não, ele add
        if (buscarAnimal(animal.getId()) != null) {
            return false;
        } else {
            this.animais.add(animal);
            return true;
        }

    }

}