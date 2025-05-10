package com.samethabali.calculater

import com.samethabali.calculater.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var operand1: Double? = null
    private var pendingOperation = ""
    private var isNewOperation = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupButtonClickListeners()
    }

    private fun setupButtonClickListeners() {
        val numberButtonClickListener = View.OnClickListener { v ->
            if (isNewOperation) {
                binding.resultEditText.setText("")
                isNewOperation = false
            }
            val button = v as Button
            binding.resultEditText.append(button.text)
        }

        binding.button0.setOnClickListener(numberButtonClickListener)
        binding.button1.setOnClickListener(numberButtonClickListener)
        binding.button2.setOnClickListener(numberButtonClickListener)
        binding.button3.setOnClickListener(numberButtonClickListener)
        binding.button4.setOnClickListener(numberButtonClickListener)
        binding.button5.setOnClickListener(numberButtonClickListener)
        binding.button6.setOnClickListener(numberButtonClickListener)
        binding.button7.setOnClickListener(numberButtonClickListener)
        binding.button8.setOnClickListener(numberButtonClickListener)
        binding.button9.setOnClickListener(numberButtonClickListener)

        binding.buttonPlus.setOnClickListener {
            handleOperation("+")
        }

        binding.buttonMinus.setOnClickListener {
            handleOperation("-")
        }
        binding.buttonMultiply.setOnClickListener {
            handleOperation("*")
        }
        binding.buttonDivide.setOnClickListener {
            handleOperation("/")
        }

        binding.buttonEquals.setOnClickListener {
            performCalculation()
        }

        binding.buttonClear.setOnClickListener {
            resetCalculator()
        }
    }

    private fun handleOperation(operation: String) {
        val inputText = binding.resultEditText.text.toString()
        if (inputText.isNotEmpty()) {
            try {
                operand1 = inputText.toDouble()
                pendingOperation = operation
                isNewOperation = true
            } catch (e: NumberFormatException) {
                binding.resultEditText.setText("Hata")
                isNewOperation = true
            }
        }
    }

    private fun performCalculation() {
        val inputText = binding.resultEditText.text.toString()
        if (operand1 != null && inputText.isNotEmpty() && pendingOperation == "+") {
            try {
                val operand2 = inputText.toDouble()
                val result = operand1!! + operand2
                binding.resultEditText.setText(result.toString())
                operand1 = null
                isNewOperation = true
            } catch (e: NumberFormatException) {
                binding.resultEditText.setText("Hata")
                isNewOperation = true
            }
        }
        if (operand1 != null && inputText.isNotEmpty() && pendingOperation == "-") {
            try {
                val operand2 = inputText.toDouble()
                val result = operand1!! - operand2
                binding.resultEditText.setText(result.toString())
                operand1 = null
                isNewOperation = true
            } catch (e: NumberFormatException) {
                binding.resultEditText.setText("Hata")
                isNewOperation = true
            }
        }
        if (operand1 != null && inputText.isNotEmpty() && pendingOperation == "*") {
            try {
                val operand2 = inputText.toDouble()
                val result = operand1!! * operand2
                binding.resultEditText.setText(result.toString())
                operand1 = null
                isNewOperation = true
            } catch (e: NumberFormatException) {
                binding.resultEditText.setText("Hata")
                isNewOperation = true
            }
        }
        if (operand1 != null && inputText.isNotEmpty() && pendingOperation == "/") {
            try {
                val operand2 = inputText.toDouble()
                val result = operand1!! / operand2
                binding.resultEditText.setText(result.toString())
                operand1 = null
                isNewOperation = true
            } catch (e: NumberFormatException) {
                binding.resultEditText.setText("Hata")
                isNewOperation = true
            }
        }
    }

    private fun resetCalculator() {
        binding.resultEditText.setText("0")
        operand1 = null
        pendingOperation = ""
        isNewOperation = true
    }
}