package iuh.fit.is;

public abstract class CoSoVatchat {
	protected String ma;
	protected ChatLieu chatLieu;
	protected KichCo kichCo;
	protected int soChan;
    // Constructor
    public CoSoVatchat(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan) {
        setMa(ma);
        setChatLieu(chatLieu);
        setKichCo(kichCo);
        setSoChan(soChan);
    }
    // Getter & Setter với ràng buộc
    public String getMa() {
        return ma;
    }
    public void setMa(String ma) {
        if (ma == null || ma.trim().isEmpty()) {
            throw new IllegalArgumentException("Mã không được rỗng!");
        }
        this.ma = ma;
    }
    public ChatLieu getChatLieu() {
        return chatLieu;
    }
    public void setChatLieu(ChatLieu chatLieu) {
        if (chatLieu == null) {
            throw new IllegalArgumentException("Chất liệu không hợp lệ!");
        }
        this.chatLieu = chatLieu;
    }
    public KichCo getKichCo() {
        return kichCo;
    }
    public void setKichCo(KichCo kichCo) {
        if (kichCo == null) {
            throw new IllegalArgumentException("Kích cỡ không hợp lệ!");
        }
        this.kichCo = kichCo;
    }
    public int getSoChan() {
        return soChan;
    }
    public void setSoChan(int soChan) {
        if (soChan <= 0) {
            throw new IllegalArgumentException("Số chân phải lớn hơn 0");
        }
        this.soChan = soChan;
    }
    // Phương thức trừu tượng
    public abstract double canNang();
    @Override
    public String toString() {
        return String.format("Mã: %s, Chất liệu: %s, Kích cỡ: %s, Số chân: %d",
                ma, chatLieu, kichCo, soChan);
    }
}
