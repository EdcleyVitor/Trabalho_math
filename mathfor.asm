; sistema_math.asm
; NASM x86 Linux

section .data
msg1 db "BEM VINDO AO SEU SISTEMA MATH",10
len1 equ $-msg1

menu db "Escolhas as funcoes desejadas:",10
     db "1. PA - Progresao Aritmetica",10
     db "2. PG - Progresao Geometrica",10
     db "3. MF - Multiplicao Fatorial",10
     db "4. Sobre",10
     db "Qual vc escolheu? ",0
lenmenu equ $-menu

sobremsg db "Criado por Edcley em 20 minutos",10
         db "Para ponto extra e aula de Math",10
lensobre equ $-sobremsg

section .bss
op resb 2

section .text
global _start

_start:

; imprimir titulo
mov eax,4
mov ebx,1
mov ecx,msg1
mov edx,len1
int 0x80

; imprimir menu
mov eax,4
mov ebx,1
mov ecx,menu
mov edx,lenmenu
int 0x80

; ler escolha
mov eax,3
mov ebx,0
mov ecx,op
mov edx,2
int 0x80

mov al,[op]

cmp al,'1'
je pa

cmp al,'2'
je pg

cmp al,'3'
je mf

cmp al,'4'
je sobre

jmp sair

; -----------------
pa:
mov eax,4
mov ebx,1
mov ecx,pa_msg
mov edx,pa_len
int 0x80
jmp sair

pg:
mov eax,4
mov ebx,1
mov ecx,pg_msg
mov edx,pg_len
int 0x80
jmp sair

mf:
mov eax,4
mov ebx,1
mov ecx,mf_msg
mov edx,mf_len
int 0x80
jmp sair

sobre:
mov eax,4
mov ebx,1
mov ecx,sobremsg
mov edx,lensobre
int 0x80
jmp sair

sair:
mov eax,1
xor ebx,ebx
int 0x80

section .data

pa_msg db "Progresao Aritmetica selecionada",10
pa_len equ $-pa_msg

pg_msg db "Progresao Geometrica selecionada",10
pg_len equ $-pg_msg

mf_msg db "Multiplicao Fatorial selecionada",10
mf_len equ $-mf_msg
