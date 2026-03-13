program sistema_math
implicit none

integer :: escmain

print *, "BEM VINDO AO SEU SISTEMA MATH"

print *, "Escolhas as funçoes desejadas: "
print *, "1. PA - Progresão Aritemetica"
print *, "2. PG - Progresão Geometrica"
print *, "3. CMP - Principio Multipicativo da Contagem"
print *, "3. MF - Multiplicão Fatorial"
print *, "4. Sobre"

print *, "Qual vc escolheu? "
read *, escmain

if (escmain == 1) then
    call pa()
else if (escmain == 2) then
    call pg()
else if (escmain == 3) then
    call mf()
else if (escmain == 4) then
    call sobre()
end if

contains

subroutine pa()
implicit none
integer :: num1, num2, r, n, i, form

print *, "Progresão Aritimetica"
print *, "Digite os 2 primeiros numeros entre espaço:"
read *, num1, num2

r = num2 - num1

print *, "Quantos termos vc deseja:"
read *, n

do i = 0, n-1
    form = num1 + i * r
    print *, i+1, "° Termos:", form
end do

print *
print *, "Razão:", r

end subroutine pa


subroutine pg()
implicit none
integer :: num1, num2, n, i
real :: r, form

print *, "Progresão Geometrica"
print *, "Digite os 2 primeiros numeros entre espaço:"
read *, num1, num2

r = real(num2) / real(num1)

print *, "Quantos termos vc deseja:"
read *, n

do i = 0, n-1
    form = num1 * (r ** i)
    print *, i+1, "° Termos:", form
end do

print *
print *, "Razão:", r

end subroutine pg


subroutine mf()
implicit none
integer :: n, i, resultado

print *, "Multiplicão Fatorial"
print *, "Digite um número inteiro positivo para calcular o fatorial:"
read *, n

if (n < 0) then
    print *, "Fatorial não é definido para números negativos."
else if (n == 0) then
    print *, "O fatorial de 0 é 1."
else
    resultado = 1

    print *, "Cálculo:"
    do i = n, 1, -1
        resultado = resultado * i
        if (i > 1) then
            write(*,'(I0,A)', advance="no") i, " * "
        else
            write(*,'(I0)', advance="no") i
        end if
    end do

    print *
    print *, "Resultado de", n, "! é:", resultado
end if

end subroutine mf


subroutine sobre()
print *, "Criado por Edcley em 20 minutos"
print *, "Para ponto extra e aula de Math"
end subroutine sobre

end program sistema_math
