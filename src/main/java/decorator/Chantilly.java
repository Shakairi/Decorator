package decorator;

class Chantilly extends CafeDecorator {
    public Chantilly(Cafe cafe) {
        super(cafe);
    }

    @Override
    public double custo() {
        return super.custo() + 1.0;
    }
}