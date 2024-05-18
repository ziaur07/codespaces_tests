#include <stdio.h>
#include <string.h>
#include <ctype.h>

#define MAX_LENGTH 100
#define MAX_TRIES 7

void print_word(char word[], char guessed_letters[])
{
    for (int i = 0; i < strlen(word); i++)
    {
        if (strchr(guessed_letters, tolower(word[i])))
        {
            printf("%c ", word[i]);
        }
        else
        {
            printf("_ ");
        }
    }
    printf("\n");
}

int main()
{
    char word[MAX_LENGTH] = "hangman";
    char guessed_letters[MAX_LENGTH] = "";
    int tries = 0;

    while (tries < MAX_TRIES)
    {
        printf("Guess a letter: ");
        char guess;
        scanf(" %c", &guess);
        guess = tolower(guess);

        if (!strchr(word, guess))
        {
            tries++;
        }
        else if (!strchr(guessed_letters, guess))
        {
            strncat(guessed_letters, &guess, 1);
        }

        print_word(word, guessed_letters);

        if (strlen(guessed_letters) == strlen(word))
        {
            printf("Congratulations, you won!\n");
            return 0;
        }
    }

    printf("Sorry, you lost. The word was %s.\n", word);
    return 0;
}