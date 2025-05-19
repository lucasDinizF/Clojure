(ns Lista-2.AumentoSalario)


(defn porcentagem [percentual flutuante n]
  (let [reajuste (* n flutuante)
        total (+ n reajuste)]
    (println (str (format "Novo salario: %.2f\n" total)
                  (format "Reajuste ganho: %.2f\n" reajuste)
                  "Em percentual: " percentual " %"))))

(defn aumento [x]
  (cond (and (>= x 0.0) (<= x 400.0)) (porcentagem 15 0.15 x)
        (and (> x 400.0) (<= x 800.0)) (porcentagem 12 0.12 x)
        (and (> x 800.0) (<= x 1200.0)) (porcentagem 10 0.10 x)
        (and (> x 1200.0) (<= x 2000.0)) (porcentagem 7 0.07 x)
        (> x 2000.0) (porcentagem 4 0.04 x)))


(defn main []
  (let [x (read)]
    (aumento x)
    ))

(main)