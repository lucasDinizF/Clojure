(ns Lista-2.Teste-selecao)


(defn teste [a b c d]
  (println (if (and (> b c) (> d a) (> (+ c d) (+ a b)) (even? a)) "Valores aceitos" "Valores nao aceitos")))

(defn main []
  (let [a (read)
        b (read)
        c (read)
        d (read)]
    (teste a b c d)))

(main)