class TrieNode:
    def __init__(self):
        self.children = {}
        self.is_end_of_word = False


class WordDictionary:
    def __init__(self):
        self.root = TrieNode()

    def addWord(self, word: str) -> None:
        current = self.root

        for char in word:
            if char not in current.children:
                current.children[char] = TrieNode()

            current = current.children[char]

        current.is_end_of_word = True

    def search(self, word: str) -> bool:
        def dfs(j, node):
            current = node

            for i in range(j, len(word)):
                c = word[i]

                if c == ".":
                    for child in current.children.values():
                        if dfs(i + 1, child):
                            return True

                    return False
                else:
                    if c not in current.children:
                        return False

                    current = current.children[c]

            return current.is_end_of_word

        return dfs(0, self.root)