(ns programacaofuncional.diferenca)

;;(defn diferenca [a b c d] (- (* a b) (* c d)))

;;(def a (read))
;;(def b (read))
;;(def c (read))
;;(def d (read))

;;(println "DIFERENCA =" (diferenca a b c d))

;;(defn velocidade [x] (* x 2))

;;(def x (read))

;;(println (str (velocidade x) " minutos"))



(defn conversao [x]
  (def horas (quot x 3600))
  (def minutos (quot (mod x 3600) 60))
  (def segundos (mod x 60))
  (println (format "%d:%d:%d" horas minutos segundos)))

(def x (read))

(conversao x)


(defn idade [x]
  (def ano (quot x 365))
  (def mes (quot (mod x 365) 30))
  (def dias (mod (mod x 365) 30))
  (println (format "%d ano(s)" ano))
  (println (format "%d mes(es)" mes))
  (println (format "%d dia(s)" dias)))

(def n (read))

(idade n)