(ns Lista-4.PIPN)

(defn positivos [x]
  (count (filter pos? x)))

(defn pares [x]
  (count (filter even? x)))

(defn negativos [x]
  (count (filter neg? x)))

(defn impares [x]
  (count (filter odd? x)))

(defn main []
  (let [n (repeatedly 5 read)]
    (println (pares n) "valor(es) par(es)")
    (println (impares n) "valor(es) impar(es)")
    (println (positivos n) "valor(es) positivo(s)")
    (println (negativos n) "valor(es) negativo(s)")
    ))

(main)