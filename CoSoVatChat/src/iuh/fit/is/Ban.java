package iuh.fit.is;

class Ban extends CoSoVatchat {
    private double doDai;
    private double doRong;

    public Ban(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan, double doDai, double doRong) {
        super(ma, chatLieu, kichCo, soChan);
        setDoDai(doDai);
        setDoRong(doRong);
    }
    public double getDoDai() {
        return doDai;
    }
    public void setDoDai(double doDai) {
        if (doDai <= 0) {
            throw new IllegalArgumentException("Độ dài phải lớn hơn 0!");
        }
        this.doDai = doDai;
    }
    public double getDoRong() {
        return doRong;
    }
    public void setDoRong(double doRong) {
        if (doRong <= 0) {
            throw new IllegalArgumentException("Độ rộng phải lớn hơn 0!");
        }
        this.doRong = doRong;
    }
    @Override
    public double canNang() {
        return doDai * doRong * 10 + getSoChan() * 10;
    }
    @Override
    public String toString() {
        return String.format("%s, Loại: Bàn, Dài: %.2f, Rộng: %.2f, Cân nặng: %.2f",
                super.toString(), doDai, doRong, canNang());
    }
}
