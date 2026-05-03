public class StackSurat15 {
    Surat15[] stack;
    int top;
    int max;

    StackSurat15(int max) {
        this.max = max;
        stack = new Surat15[max];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == max - 1;
    }

    void push(Surat15 s) {
        if (!isFull()) {
            stack[++top] = s;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    Surat15 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Surat teratas:");
            stack[top].tampil();
        } else {
            System.out.println("Stack kosong!");
        }
    }

    void cari(String nama) {
        boolean ketemu = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                stack[i].tampil();
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Data tidak ditemukan!");
        }
    }
}
