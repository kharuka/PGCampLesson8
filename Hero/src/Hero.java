public class Hero implements Buki, Majic {
    @Override
    public void useBuki() {
        System.out.println("武器を使って攻撃した！");
    }

    @Override
    public void useMagic() {
        System.out.println("魔法を使って攻撃した！");
    }
}
