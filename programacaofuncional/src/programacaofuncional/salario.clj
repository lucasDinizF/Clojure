(ns programacaofuncional.salario)

;;(def n (read))

;;(defn salario [h v] (* h v))

;;(def h (read))
;;(def v (read))

;;(println "NUMBER =" n)

;;(println "SALARY = U$" (format "%.2f" (salario h v)))


(def n (read))

(defn salario [v b]
  (+ v (* b 0.15)))

(def v (read))
(def b (read))

(println "TOTAL = R$" (format "%.2f" (salario v b)))