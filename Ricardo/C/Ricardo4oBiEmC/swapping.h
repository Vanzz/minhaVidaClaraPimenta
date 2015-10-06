#ifndef SWAPPING_H
#define SWAPPING_H

struct reg_bitmapped {};

struct reg_nos {};

struct reg_bitmapped* bitmapped_novo(int total_mem, int tam_pedaco);
void bitmapped_registrar_proc(struct reg_bitmapped* reg, int tamanho);
void bitmapped_registrar_espaco(struct reg_bitmapped* reg, int inicio, int fim);

struct reg_nos* nos_novo(int total_mem, int tam_pedaco);
void nos_registrar_proc(struct reg_nos* reg, int tamanho);
void nos_registrar_espaco(struct reg_nos* reg, int inicio, int fim);

#endif