package org.example;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }
    public boolean checkNameToEmboss() throws Exception{
        Account account = new Account(name);

        if (account.name.length() < 3 || account.name.length() > 19){
            throw new Exception("Недостаточно символов или переполнение символов");
        }else if(account.name.isBlank()){
            throw new Exception("Строка пустая");
        }else if(account.name.startsWith(" ") || account.name.endsWith(" ")){
            throw new Exception("Строка начинается или заканчивается пробелом");
        }else if(!account.name.contains(" ")){
            throw new Exception("В строке нет пробелов");
        }
        return true;
    }
}
