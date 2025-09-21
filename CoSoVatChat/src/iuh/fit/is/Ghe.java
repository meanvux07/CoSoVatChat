package iuh.fit.is;

class Ghe extends CoSoVatchat {
    private boolean coTuaGhe;

    public Ghe(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan, boolean coTuaGhe) {
        super(ma, chatLieu, kichCo, soChan);
        this.coTuaGhe = coTuaGhe;
    }

    public boolean isCoTuaGhe() {
        return coTuaGhe;
    }

    public void setCoTuaGhe(boolean coTuaGhe) {
        this.coTuaGhe = coTuaGhe;
    }

    @Override
    public double canNang() {
        return getSoChan() * 10 + (coTuaGhe ? 20 : 0);
    }

    @Override
    public String toString() {
        return String.format("%s, Loại: Ghế, Có tựa: %s, Cân nặng: %.2f",
                super.toString(), coTuaGhe, canNang());
    }
}