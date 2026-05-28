import random

def suggest_books():
	

	suggest = input('Enter to get book suggestions: ')
	while True:
		book = random.choice(books)
		page = random.randint(1, 100)

		print('would you like to read ---', book, '---\n')
		print('Page --', page, '--\n')

		user_input = int(input('Press any number for next suggestions or (0) to stop: '))
		if user_input == 0:
			print('Seems like enough knowledge for the day\n')
			break


def add_books():
	
	add = input('Enter a book name to add if not existent: ')

	if add not in  books:
		books.append(add)
	else:
		print('Book already exist')	


def remove_books():
	

	delete = input('Remove a book from your collection: ')

	if delete in books:
		books.remove(delete)		
	else:
		print('Book not in collection')	
		
	
def showcase():
	print(books)



print('Books collection system')

books = [
'The ways of bottling(Three pit)',
'Once in a arsenal(The 22 years tale)',
'The universe',
'Course of knowledge',
'The heart of man',
'Colorful life',
'The Goat',
'Fergie time',
'Ferguson history',
'Mind under glass(psychology at its peak)'
]


while True:
	print('1: Books suggestion\n')
	print('2: Add books to collection\n')
	print('3: Remove a book from collection\n')
	print('4: See books collection status\n')
	book_collection = int(input('Enter an option: '))

	match(book_collection):
		case 1 :
			suggest_books()
		case 2 :	
			add_books()
		case 3 :	
			remove_books()
		case 4 :	
			showcase()
	exit = input('input (exit) to quit or any key to continue to menu')		
	if exit == 'exit':
		print('Closing collection')
		break
