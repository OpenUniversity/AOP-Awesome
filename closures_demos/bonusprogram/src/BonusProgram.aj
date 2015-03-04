package bonusprogram;

aspect BonusProgram {
  joinpoint int Buying(String cat, int amount);

  int around Buying(String cat, int amt) {
    if (cat.equals("milk"))
      amt += amt / 2;
    return proceed(cat, amt);
  }
}

