package decorator;

class Caramelo extends CafeDecorator {
    public Caramelo(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double custo() {
        return super.custo() + 1.5;
    }
}