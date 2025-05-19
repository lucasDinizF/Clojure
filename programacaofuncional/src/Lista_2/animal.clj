(ns Lista-2.animal)

(defn animais [a b c]
  (cond (and (= a "vertebrado") (= b "ave") (= c "carnivoro")) "aguia"
        (and (= a "vertebrado") (= b "ave") (= c "onivoro")) "pomba"
        (and (= a "vertebrado") (= b "mamifero") (= c "onivoro")) "homem"
        (and (= a "vertebrado") (= b "mamifero") (= c "herbivoro")) "vaca"
        (and (= a "invertebrado") (= b "inseto") (= c "hematofago")) "pulga"
        (and (= a "invertebrado") (= b "inseto") (= c "herbivoro")) "lagarta"
        (and (= a "invertebrado") (= b "anelideo") (= c "hematofago")) "sanguessuga"
        (and (= a "invertebrado") (= b "anelideo") (= c "onivoro")) "minhoca"
        :else "animal"))


(defn main []
  (let [a (read-line)
        b (read-line)
        c (read-line)]
    (println (animais a b c))))

(main)